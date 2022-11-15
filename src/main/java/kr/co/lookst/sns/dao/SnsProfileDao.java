package kr.co.lookst.sns.dao;

import java.util.List;

import kr.co.lookst.sns.domain.ProfileFeedDto;
import kr.co.lookst.sns.domain.SnsProfileDto;

public interface SnsProfileDao {

	SnsProfileDto infoselect(String member_id) throws Exception;
	
	List<ProfileFeedDto> profileFeed(String member_id) throws Exception;
}