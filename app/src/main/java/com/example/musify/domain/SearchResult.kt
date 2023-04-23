package com.example.musify.domain

import android.graphics.Bitmap
import com.example.musify.musicplayer.MusicPlayerV2

sealed class SearchResult {
    /**
     * A class that models the result of a search operation for a
     * specific album.
     * Note: The [artistsString] property is meant to hold a comma separated
     * list of artists who worked on the album.
     */
    data class AlbumSearchResult(
        val id: String,
        val name: String,
        val artistsString: String,
        val albumArtUrlString: String,
        val yearOfReleaseString: String,
    ) : SearchResult()

    /**
     * A class that models the result of a search operation for a
     * specific artist.
     */
    data class ArtistSearchResult(
        val id: String,
        val name: String,
        val imageUrlString: String?
    ) : SearchResult()

    /**
     * A class that models the result of a search operation for a
     * specific playlist.
     */
    data class PlaylistSearchResult(
        val id: String,
        val name: String,
        val ownerName: String,
        val totalNumberOfTracks: String,
        val imageUrlString: String?
    ) : SearchResult()

    /**
     * A class that models the result of a search operation for a
     * specific track.
     * Note: The [artistsString] property is meant to hold a comma separated
     * list of artists who worked on the track.
     */
    data class TrackSearchResult(
        val id: String,
        val name: String,
        val imageUrlString: String,
        val artistsString: String,
        val trackUrlString: String?
    ) : SearchResult()
}

/**
 * A mapper method used to map an instance of
 * [SearchResult.TrackSearchResult] to an instance of [MusicPlayerV2.Track].
 */
fun SearchResult.TrackSearchResult.toMusicPlayerTrack(albumArtBitmap: Bitmap): MusicPlayerV2.Track {
    if (trackUrlString == null) throw IllegalStateException("The trackUrlString cannot be null during conversion")
    return MusicPlayerV2.Track(
        id = id,
        title = name,
        artistsString = artistsString,
        albumArt = albumArtBitmap,
        albumArtUrlString = this.imageUrlString,
        trackUrlString = trackUrlString,
    )
}
