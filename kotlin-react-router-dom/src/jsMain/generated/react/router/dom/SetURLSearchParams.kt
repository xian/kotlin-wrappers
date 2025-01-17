package react.router.dom

import react.router.NavigateOptions
import web.url.URLSearchParams

typealias SetURLSearchParams = (nextInit: ((prev: URLSearchParams) -> URLSearchParamsInit) /* use undefined for default */, navigateOpts: NavigateOptions? /* use undefined for default */) -> Unit
