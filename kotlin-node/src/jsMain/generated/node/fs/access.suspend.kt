// Generated by Karakum - do not modify it manually!

package node.fs


suspend fun access(path: PathLike, mode: Number = undefined.unsafeCast<Nothing>()): Unit =
    accessAsync(
        path, mode
    ).await()
