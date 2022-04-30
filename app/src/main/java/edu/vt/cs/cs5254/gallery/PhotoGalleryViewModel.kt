package edu.vt.cs.cs5254.gallery

import android.graphics.drawable.Drawable
import androidx.lifecycle.ViewModel

class PhotoGalleryViewModel : ViewModel() {
    val galleryItemsLiveData = FlickrFetcher.galleryItemsLiveData

    fun loadPhotos() = FlickrFetcher.fetchPhotos(false)

    fun reloadPhotos() = FlickrFetcher.fetchPhotos(true)

    fun storeThumbnail(id: String, drawable: Drawable) {
        FlickrFetcher.storeThumbnail(id, drawable)
    }
}