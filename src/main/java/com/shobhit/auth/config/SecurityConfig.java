// package com.shobhit.auth.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;

// @Configuration
// public class SecurityConfig {

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }

//     @Bean
// public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//     http
//         .securityMatcher("/**") // ✅ Apply rules to all paths
//         .csrf(csrf -> csrf.disable())
//         .authorizeHttpRequests(auth -> auth
//             .requestMatchers(
//                 "/swagger-ui.html",
//                 "/swagger-ui/**",
//                 "/v3/api-docs/**",
//                 "/swagger-resources/**",
//                 "/webjars/**",
//                 "/v2/api-docs/**",
//                 "/api/auth/**",
//                 "/static/**",
//                 "/",
//                 "/index.html"
//             ).permitAll()
//             .anyRequest().authenticated()
//         )
//         .formLogin(form -> form.disable())
//         .httpBasic(httpBasic -> httpBasic.disable());

//     return http.build();
// }

// }

package com.shobhit.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                    "/swagger-ui.html",
                    "/swagger-ui/**",
                    "/v3/api-docs/**",
                    "/swagger-resources/**",
                    "/webjars/**",
                    "/v2/api-docs/**",
                    "/api/auth/**",
                    "/",
                    "/index.html"
                ).permitAll()
                .anyRequest().permitAll() // ✅ Temporarily allow all for debugging
            )
            .formLogin(form -> form.disable())
            .httpBasic(httpBasic -> httpBasic.disable());

        return http.build();
    }
}
