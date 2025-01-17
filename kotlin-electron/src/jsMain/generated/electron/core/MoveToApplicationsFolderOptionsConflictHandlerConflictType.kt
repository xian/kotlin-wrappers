package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{exists: 'exists', existsAndRunning: 'existsAndRunning'}/*union*/)""")
sealed external interface MoveToApplicationsFolderOptionsConflictHandlerConflictType {
    companion object {
        val exists: MoveToApplicationsFolderOptionsConflictHandlerConflictType
        val existsAndRunning: MoveToApplicationsFolderOptionsConflictHandlerConflictType
    }
}
