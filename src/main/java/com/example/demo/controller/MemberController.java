package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findMemberById(@PathVariable(name = "id") Long memberId ) {
		return ResponseEntity.ok(memberService.getMemberById(memberId));
	}
	
	@GetMapping("/technolgy/{technologyId}")
	public ResponseEntity<?> findMembersByTechnologyId(@PathVariable(name = "technologyId") Long technologyId ) {
		return ResponseEntity.ok(memberService.getMembersByTechnologyId(technologyId));
	}
	
	
	@GetMapping("/eligible")
	public ResponseEntity<?> findEligibleMembers(){
		return ResponseEntity.ok(memberService.getEligibleMembers());
	}
	
	@PostMapping
	public ResponseEntity<?> saveMember(@RequestBody Member member){
		return ResponseEntity.status(201).body(memberService.saveMember(member));
	}
	
	
	

}
