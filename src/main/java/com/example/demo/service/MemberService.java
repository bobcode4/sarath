package com.example.demo.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public Member getMemberById(Long id){
		return memberRepository.findById(id).get();
	}
	
	public List<Member> getMembersByTechnologyId(Long technologyId){
		return memberRepository.findAllByTechnologyId(technologyId);
	}
	
	public List<Member> getEligibleMembers() {
	   List<Member> members = 	memberRepository.findAll();
	   return members.stream().filter(member ->{
		   return ((2021-member.getDateOfBirth().getYear()>=25)
				    && (member.getExperience()>=3));
	   }).collect(Collectors.toList());
	}
	
	public Member saveMember(Member member) {
		return memberRepository.save(member);
	}

}
