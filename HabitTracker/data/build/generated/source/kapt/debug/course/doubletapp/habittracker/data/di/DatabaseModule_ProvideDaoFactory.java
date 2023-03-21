// Generated by Dagger (https://dagger.dev).
package course.doubletapp.habittracker.data.di;

import course.doubletapp.habittracker.data.db.HabitDao;
import course.doubletapp.habittracker.data.db.HabitDataBase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideDaoFactory implements Factory<HabitDao> {
  private final DatabaseModule module;

  private final Provider<HabitDataBase> databaseProvider;

  public DatabaseModule_ProvideDaoFactory(DatabaseModule module,
      Provider<HabitDataBase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public HabitDao get() {
    return provideDao(module, databaseProvider.get());
  }

  public static DatabaseModule_ProvideDaoFactory create(DatabaseModule module,
      Provider<HabitDataBase> databaseProvider) {
    return new DatabaseModule_ProvideDaoFactory(module, databaseProvider);
  }

  public static HabitDao provideDao(DatabaseModule instance, HabitDataBase database) {
    return Preconditions.checkNotNullFromProvides(instance.provideDao(database));
  }
}
