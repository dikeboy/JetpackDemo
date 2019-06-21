package com.androidemu.leo.server

import retrofit2.Retrofit

class HttpServerManager {
    private  lateinit var  service: HttpService
    init {
        initService()
    }
    private fun initService (){
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.baidu.com")
            .build()

        service = retrofit.create(HttpService::class.java!!)
    }

    companion object {
        val instance: HttpServerManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            HttpServerManager() }
    }

    fun getService():HttpService{
        return service
    }

}