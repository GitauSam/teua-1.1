package com.zenza.auth.config

import com.zenza.store.repository.UserRepository
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class UserDetailsServiceImpl(
    private val userRepository: UserRepository
): UserDetailsService {

    @Transactional
    override fun loadUserByUsername(username: String?): UserDetails {
        val user = userRepository.findByUsername(username!!)

        user
            ?.let {
                return User(user.username, user.password, emptyList())
            }?: run {
            throw UsernameNotFoundException("Invalid user. Did not find user with username {$username}")
            }
    }
}