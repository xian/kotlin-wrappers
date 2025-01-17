package remix.run.router

import web.http.FormData
import web.url.URL

/**
 * Arguments passed to shouldRevalidate function
 */

sealed external interface ShouldRevalidateFunctionArgs {
    var currentUrl: URL
    var currentParams: Params
    var nextUrl: URL
    var nextParams: Params
    var formMethod: (FormMethod)?
    var formAction: (String)?
    var formEncType: (FormEncType)?
    var text: String?
    var formData: FormData?
    var json: JsonValue?
    var actionResult: Any?
    var defaultShouldRevalidate: Boolean
}
