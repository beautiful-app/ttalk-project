package com.ttalk.mapper;

import java.util.List;

import com.ttalk.pojo.vo.FriendRequestVO;
import com.ttalk.pojo.vo.MyFriendsVO;
import com.ttalk.pojo.Users;
import com.ttalk.utils.MyMapper;

public interface UsersMapperCustom extends MyMapper<Users> {
	
	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);
	
	public List<MyFriendsVO> queryMyFriends(String userId);
	
	public void batchUpdateMsgSigned(List<String> msgIdList);
	
}