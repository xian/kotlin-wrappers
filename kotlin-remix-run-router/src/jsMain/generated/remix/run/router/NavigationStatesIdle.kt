package remix.run.router


sealed external interface NavigationStatesIdle {
    var state: String /* "idle" */
    var location: Nothing?
    var formMethod: Nothing?
    var formAction: Nothing?
    var formEncType: Nothing?
    var formData: Nothing?
    var json: Nothing?
    var text: Nothing?
}
