package project.mentorship.projectmentorship.service.impl;

import project.mentorship.projectmentorship.repository.MentorRepository;
import project.mentorship.projectmentorship.service.FindMentorService;
import project.mentorship.projectmentorship.vo.MentorVo;

import java.util.ArrayList;
import java.util.List;

public class FindMentorServiceImpl implements FindMentorService {

    MentorRepository mentorRepository;

    @Override
    public List<MentorVo> getAllMentorsAvaliable() {
        List<MentorVo> mentorsList = new ArrayList<>();




        return mentorsList;
    }
}
