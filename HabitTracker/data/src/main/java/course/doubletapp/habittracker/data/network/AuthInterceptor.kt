package course.doubletapp.habittracker.data.network

import okhttp3.Interceptor
import okhttp3.Response

private var TOKEN = "52ae48f4-e93e-4c87-b5a1-2e096e569d67"

class AuthInterceptor : Interceptor {

    companion object {
        private const val authHeader = "Authorization"
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val builder = originalRequest
            .newBuilder()
            .header(authHeader, TOKEN)
        val newRequest = builder.build()
        return chain.proceed(newRequest)
    }
}