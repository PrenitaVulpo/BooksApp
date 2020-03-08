package com.example.books.repository

import com.example.books.model.ImageLinks
import com.example.books.model.Volume
import com.example.books.model.VolumeInfo

object BookVolumeMapper {
    fun  bookToVolume(book: Book): Volume{
        return Volume(
            book.id,
            book.selfLink,
            VolumeInfo(
                book.title,
                book.description,
                book.authors,
                book.publisher,
                book.publishedDate,
                book.pageCount,
                ImageLinks(
                    book.smallThumbnail,
                    book.thumbnail
                )
            )
        )
    }

    fun  volumeToBook(volume: Volume): Book{
        return Book(
            volume.id,
            volume.selfLink,
            volume.volumeInfo.title,
            volume.volumeInfo.description,
            volume.volumeInfo.authors,
            volume.volumeInfo.publisher,
            volume.volumeInfo.publishedDate,
            volume.volumeInfo.pageCount,
            volume.volumeInfo.imageLinks?.smallThumbnail ?:"",
            volume.volumeInfo.imageLinks?.thumbnail ?:""


        )
    }
}