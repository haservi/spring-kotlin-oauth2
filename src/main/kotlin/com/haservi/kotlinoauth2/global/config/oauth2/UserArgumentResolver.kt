package com.haservi.kotlinoauth2.global.config.oauth2

enum class UserArgumentResolver {
    KAKAO {
    };

    companion object {
        val DEFAULT_LOGIN_REDIRECT_URL = "{baseUrl}/login/oauth2/code/{registrationId}"
    }

}