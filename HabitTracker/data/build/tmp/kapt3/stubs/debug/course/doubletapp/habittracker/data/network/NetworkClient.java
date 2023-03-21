package course.doubletapp.habittracker.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcourse/doubletapp/habittracker/data/network/NetworkClient;", "", "()V", "Companion", "data_debug"})
public final class NetworkClient {
    @org.jetbrains.annotations.NotNull()
    public static final course.doubletapp.habittracker.data.network.NetworkClient.Companion Companion = null;
    private static final java.lang.String baseUrl = "https://droid-test-server.doubletapp.ru/api/";
    
    public NetworkClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcourse/doubletapp/habittracker/data/network/NetworkClient$Companion;", "", "()V", "baseUrl", "", "getHabitServerAPI", "Lcourse/doubletapp/habittracker/data/network/HabitServerAPI;", "client", "Lokhttp3/OkHttpClient;", "getHttpClient", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final okhttp3.OkHttpClient getHttpClient() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final course.doubletapp.habittracker.data.network.HabitServerAPI getHabitServerAPI(@org.jetbrains.annotations.NotNull()
        okhttp3.OkHttpClient client) {
            return null;
        }
    }
}