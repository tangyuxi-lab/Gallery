package edu.vt.cs.cs5254.gallery.api

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=21c55c7bf9c47bea84d088de89574aa9" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s,geo"
    )
    fun fetchPhotos(): Call<FlickrResponse>

    @GET
    fun fetchUrlBytes(@Url url: String): Call<ResponseBody>
}