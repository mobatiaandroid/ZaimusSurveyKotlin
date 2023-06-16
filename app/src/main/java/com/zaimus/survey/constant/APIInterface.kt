package com.zaimus.survey.constant

import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiInterface
{

    /************* GENERATE OTP ****************/
    @POST("auth/generate-otp")
    @FormUrlEncoded
    fun generateOTP(
        @Field("mobile") mobile: String
    ): okhttp3.Response




}