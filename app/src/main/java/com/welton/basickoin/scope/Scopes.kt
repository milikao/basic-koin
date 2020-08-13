package com.welton.basickoin.scope

import org.koin.core.qualifier.named
import org.koin.core.scope.ScopeID
import org.koin.dsl.module


val moduleScopeSession = module {
    // Shared user session data
    scope(named("session")) {
        scoped { UserSession() }
    }

    // Inject UserSession instance from "session" Scope
    factory { (scopeId : ScopeID) -> Presenter(getScope(scopeId).get())}
}


class UserSession{
    fun mySession() = "Sessão do usuário"
}
data class Presenter(val userSession : UserSession)