package com.example.musify.data.remote.response;

import java.lang.System;

/**
 * A response that contains a list of albums together with additional
 * metadata.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003JM\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0006H\u00d6\u0001J\t\u0010!\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010\u00a8\u0006\""}, d2 = {"Lcom/example/musify/data/remote/response/AlbumsMetadataResponse;", "", "items", "", "Lcom/example/musify/data/remote/response/AlbumMetadataResponse;", "limit", "", "nextPageUrlString", "", "offset", "previousPageUrlString", "totalNumberOfItemsAvailable", "(Ljava/util/List;ILjava/lang/String;ILjava/lang/String;I)V", "getItems", "()Ljava/util/List;", "getLimit", "()I", "getNextPageUrlString", "()Ljava/lang/String;", "getOffset", "getPreviousPageUrlString", "getTotalNumberOfItemsAvailable", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class AlbumsMetadataResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse> items = null;
    private final int limit = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nextPageUrlString = null;
    private final int offset = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String previousPageUrlString = null;
    private final int totalNumberOfItemsAvailable = 0;
    
    /**
     * A response that contains a list of albums together with additional
     * metadata.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.musify.data.remote.response.AlbumsMetadataResponse copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse> items, int limit, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "next")
    java.lang.String nextPageUrlString, int offset, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "previous")
    java.lang.String previousPageUrlString, @com.fasterxml.jackson.annotation.JsonProperty(value = "total")
    int totalNumberOfItemsAvailable) {
        return null;
    }
    
    /**
     * A response that contains a list of albums together with additional
     * metadata.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A response that contains a list of albums together with additional
     * metadata.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A response that contains a list of albums together with additional
     * metadata.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AlbumsMetadataResponse(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse> items, int limit, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "next")
    java.lang.String nextPageUrlString, int offset, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "previous")
    java.lang.String previousPageUrlString, @com.fasterxml.jackson.annotation.JsonProperty(value = "total")
    int totalNumberOfItemsAvailable) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.musify.data.remote.response.AlbumMetadataResponse> getItems() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getLimit() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNextPageUrlString() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getOffset() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPreviousPageUrlString() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getTotalNumberOfItemsAvailable() {
        return 0;
    }
}