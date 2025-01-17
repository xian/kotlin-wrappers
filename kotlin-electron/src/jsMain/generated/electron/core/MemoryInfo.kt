package electron.core


external interface MemoryInfo {
// Docs: https://electronjs.org/docs/api/structures/memory-info
    /**
     * The maximum amount of memory that has ever been pinned to actual physical RAM.
     */
    var peakWorkingSetSize: Double

    /**
     * The amount of memory not shared by other processes, such as JS heap or HTML
     * content.
     *
     * @platform win32
     */
    var privateBytes: Double?

    /**
     * The amount of memory currently pinned to actual physical RAM.
     */
    var workingSetSize: Double
}
