// Generated by Karakum - do not modify it manually!

package node.dns


suspend fun resolvePtr(hostname: String): js.array.ReadonlyArray<String> =
    resolvePtrAsync(
        hostname
    ).await()
