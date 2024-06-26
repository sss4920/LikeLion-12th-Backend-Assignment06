package com.mutsat.www.recruitment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mutsat.www.member.domain.MutsatMember;
import com.mutsat.www.recruitment.domain.CompanyRecruitment;
import com.mutsat.www.recruitment.domain.RecruitmentStatus;

public interface CompanyRecruitmentStatusRepository extends JpaRepository<RecruitmentStatus, Long> {
	void deleteByMemberAndCompanyRecruitment(MutsatMember member, CompanyRecruitment companyRecruitment);
}
