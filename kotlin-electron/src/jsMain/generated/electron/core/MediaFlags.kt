package electron.core


external interface MediaFlags {
    /**
     * Whether the media element has crashed.
     */
    var inError: Boolean

    /**
     * Whether the media element is paused.
     */
    var isPaused: Boolean

    /**
     * Whether the media element is muted.
     */
    var isMuted: Boolean

    /**
     * Whether the media element has audio.
     */
    var hasAudio: Boolean

    /**
     * Whether the media element is looping.
     */
    var isLooping: Boolean

    /**
     * Whether the media element's controls are visible.
     */
    var isControlsVisible: Boolean

    /**
     * Whether the media element's controls are toggleable.
     */
    var canToggleControls: Boolean

    /**
     * Whether the media element can be printed.
     */
    var canPrint: Boolean

    /**
     * Whether or not the media element can be downloaded.
     */
    var canSave: Boolean

    /**
     * Whether the media element can show picture-in-picture.
     */
    var canShowPictureInPicture: Boolean

    /**
     * Whether the media element is currently showing picture-in-picture.
     */
    var isShowingPictureInPicture: Boolean

    /**
     * Whether the media element can be rotated.
     */
    var canRotate: Boolean

    /**
     * Whether the media element can be looped.
     */
    var canLoop: Boolean
}
