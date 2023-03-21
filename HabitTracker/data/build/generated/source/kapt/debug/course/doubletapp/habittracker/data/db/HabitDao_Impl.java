package course.doubletapp.habittracker.data.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HabitDao_Impl implements HabitDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HabitEntity> __insertionAdapterOfHabitEntity;

  private final HabitTypeConverter __habitTypeConverter = new HabitTypeConverter();

  private final EntityInsertionAdapter<HabitEntity> __insertionAdapterOfHabitEntity_1;

  private final EntityDeletionOrUpdateAdapter<HabitEntity> __deletionAdapterOfHabitEntity;

  public HabitDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHabitEntity = new EntityInsertionAdapter<HabitEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `HabitEntity` (`name`,`description`,`priority`,`type`,`count`,`period`,`color`,`id`,`date`,`doneDates`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HabitEntity value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        stmt.bindLong(3, value.getPriority());
        stmt.bindLong(4, value.getType());
        stmt.bindLong(5, value.getCount());
        stmt.bindLong(6, value.getPeriod());
        stmt.bindLong(7, value.getColor());
        if (value.getId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getId());
        }
        stmt.bindLong(9, value.getDate());
        final String _tmp = __habitTypeConverter.fromDateList(value.getDoneDates());
        if (_tmp == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp);
        }
      }
    };
    this.__insertionAdapterOfHabitEntity_1 = new EntityInsertionAdapter<HabitEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `HabitEntity` (`name`,`description`,`priority`,`type`,`count`,`period`,`color`,`id`,`date`,`doneDates`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HabitEntity value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        stmt.bindLong(3, value.getPriority());
        stmt.bindLong(4, value.getType());
        stmt.bindLong(5, value.getCount());
        stmt.bindLong(6, value.getPeriod());
        stmt.bindLong(7, value.getColor());
        if (value.getId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getId());
        }
        stmt.bindLong(9, value.getDate());
        final String _tmp = __habitTypeConverter.fromDateList(value.getDoneDates());
        if (_tmp == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp);
        }
      }
    };
    this.__deletionAdapterOfHabitEntity = new EntityDeletionOrUpdateAdapter<HabitEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `HabitEntity` WHERE `name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HabitEntity value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
      }
    };
  }

  @Override
  public Object createHabit(final HabitEntity habit,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHabitEntity.insert(habit);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object editHabit(final HabitEntity habit, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfHabitEntity_1.insert(habit);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object removeHabit(final HabitEntity habit,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfHabitEntity.handle(habit);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<HabitEntity>> getAllHabits() {
    final String _sql = "SELECT * FROM HabitEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"HabitEntity"}, new Callable<List<HabitEntity>>() {
      @Override
      public List<HabitEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
          final int _cursorIndexOfPeriod = CursorUtil.getColumnIndexOrThrow(_cursor, "period");
          final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfDoneDates = CursorUtil.getColumnIndexOrThrow(_cursor, "doneDates");
          final List<HabitEntity> _result = new ArrayList<HabitEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final HabitEntity _item;
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final int _tmpCount;
            _tmpCount = _cursor.getInt(_cursorIndexOfCount);
            final int _tmpPeriod;
            _tmpPeriod = _cursor.getInt(_cursorIndexOfPeriod);
            final int _tmpColor;
            _tmpColor = _cursor.getInt(_cursorIndexOfColor);
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final int _tmpDate;
            _tmpDate = _cursor.getInt(_cursorIndexOfDate);
            final List<Integer> _tmpDoneDates;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDoneDates)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDoneDates);
            }
            _tmpDoneDates = __habitTypeConverter.toDateList(_tmp);
            _item = new HabitEntity(_tmpName,_tmpDescription,_tmpPriority,_tmpType,_tmpCount,_tmpPeriod,_tmpColor,_tmpId,_tmpDate,_tmpDoneDates);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public HabitEntity getHabitById(final String id) {
    final String _sql = "SELECT * FROM HabitEntity WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfCount = CursorUtil.getColumnIndexOrThrow(_cursor, "count");
      final int _cursorIndexOfPeriod = CursorUtil.getColumnIndexOrThrow(_cursor, "period");
      final int _cursorIndexOfColor = CursorUtil.getColumnIndexOrThrow(_cursor, "color");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfDoneDates = CursorUtil.getColumnIndexOrThrow(_cursor, "doneDates");
      final HabitEntity _result;
      if(_cursor.moveToFirst()) {
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final int _tmpPriority;
        _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
        final int _tmpType;
        _tmpType = _cursor.getInt(_cursorIndexOfType);
        final int _tmpCount;
        _tmpCount = _cursor.getInt(_cursorIndexOfCount);
        final int _tmpPeriod;
        _tmpPeriod = _cursor.getInt(_cursorIndexOfPeriod);
        final int _tmpColor;
        _tmpColor = _cursor.getInt(_cursorIndexOfColor);
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final int _tmpDate;
        _tmpDate = _cursor.getInt(_cursorIndexOfDate);
        final List<Integer> _tmpDoneDates;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfDoneDates)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfDoneDates);
        }
        _tmpDoneDates = __habitTypeConverter.toDateList(_tmp);
        _result = new HabitEntity(_tmpName,_tmpDescription,_tmpPriority,_tmpType,_tmpCount,_tmpPeriod,_tmpColor,_tmpId,_tmpDate,_tmpDoneDates);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
