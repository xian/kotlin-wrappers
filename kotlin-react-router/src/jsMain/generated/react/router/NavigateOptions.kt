package react.router

import remix.run.router.RelativeRoutingType


sealed external interface NavigateOptions {
    var replace: Boolean?
    var state: Any?
    var preventScrollReset: Boolean?
    var relative: RelativeRoutingType?
}
