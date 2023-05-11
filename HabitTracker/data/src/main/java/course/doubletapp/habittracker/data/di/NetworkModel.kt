package course.doubletapp.habittracker.data.di

import course.doubletapp.habittracker.data.network.HabitServerAPI
import course.doubletapp.habittracker.data.network.NetworkClient
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class NetworkModel {

    @Singleton
    @Provides
    fun provideHttpClient() : OkHttpClient {
        return NetworkClient.getHttpClient()
    }

    @Singleton
    @Provides
    fun provideHabitServerAPI(client: OkHttpClient) : HabitServerAPI {
        return NetworkClient.getHabitServerAPI(client)
    }
}