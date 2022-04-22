package project.mentorship.projectmentorship.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.mentorship.projectmentorship.domain.Mentor;
import project.mentorship.projectmentorship.repository.MentorRepository;
import project.mentorship.projectmentorship.service.FindMentorService;
import project.mentorship.projectmentorship.vo.MentorVo;

import java.util.ArrayList;
import java.util.List;

@Service
public class FindMentorServiceImpl implements FindMentorService {

    @Autowired
    MentorRepository mentorRepository;

    @Override
    public List<MentorVo> getAllMentorsAvaliable() {
        List<MentorVo> mentorsList = new ArrayList<>();
        List<Mentor> mentors = mentorRepository.findAll();
        mentors.forEach(m -> {
            MentorVo mentor = new MentorVo();
            mentor.setId(m.getId());
            mentor.setName(m.getName());
            mentor.setContractDate(m.getContractDate());
            mentor.setGrowthUnit(m.getGrowthUnit());
            mentor.setRole(m.getRole());
            mentor.setSeniority(m.getSeniority());
            mentorsList.add(mentor);
        });
        return mentorsList;
    }
}
