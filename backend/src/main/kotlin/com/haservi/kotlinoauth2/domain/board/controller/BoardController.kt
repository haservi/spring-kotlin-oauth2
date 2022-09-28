package com.haservi.kotlinoauth2.domain.board.controller

import com.haservi.kotlinoauth2.domain.board.dto.BoardRequestDto
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class BoardController {

    @GetMapping("/")
    fun board(dto: BoardRequestDto): String {
        return "index"
    }
}