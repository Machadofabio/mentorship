package project.mentorship.projectmentorship.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.mentorship.projectmentorship.service.impl.FindMentorServiceImpl;
import project.mentorship.projectmentorship.vo.MentorVo;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mentor")
@Api
public class MentorController {

    @Autowired
    FindMentorServiceImpl findMentorService;

    @GetMapping("/all")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Get all mentors avaliable", response = MentorVo.class),
            @ApiResponse(code = 400, message = "Fields validation error"),
            @ApiResponse(code = 500, message = "Server error"),
    })
    public ResponseEntity<List<MentorVo>> getAllMentorsAvaliable(){
        return ResponseEntity.ok(findMentorService.getAllMentorsAvaliable());
    }
}
