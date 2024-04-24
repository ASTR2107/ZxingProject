package com.example.authentification.viewmodel.hilt

import com.example.authentification.model.data.Retroift.AuthApi
import com.example.authentification.viewmodel.BaseActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ViewModelComponent::class)
class AppModule {
    @Provides
    fun provideAuthApi(): AuthApi {
        return Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient())
            .build()
            .create(AuthApi::class.java)
    }
    @Provides
    @ViewModelScoped
    fun provideAuthViewModel(authApi: AuthApi): BaseActivity{
        return BaseActivity(authApi)
    }
}