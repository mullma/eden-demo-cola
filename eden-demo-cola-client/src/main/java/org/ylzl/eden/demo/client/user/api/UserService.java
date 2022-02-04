package org.ylzl.eden.demo.client.user.api;

import org.ylzl.eden.demo.client.user.dto.UserVO;
import org.ylzl.eden.demo.client.user.dto.command.UserAddCmd;
import org.ylzl.eden.demo.client.user.dto.command.UserModifyCmd;
import org.ylzl.eden.demo.client.user.dto.command.UserRemoveCmd;
import org.ylzl.eden.demo.client.user.dto.query.UserByIdQry;
import org.ylzl.eden.demo.client.user.dto.query.UserListByPageQry;
import org.ylzl.eden.spring.framework.cola.dto.PageResponse;
import org.ylzl.eden.spring.framework.cola.dto.Response;
import org.ylzl.eden.spring.framework.cola.dto.SingleResponse;

/**
 * 用户领域业务接口
 *
 * @author gyl
 * @since 2.4.x
 */
public interface UserService {

	/**
	 * 创建用户
	 *
	 * @param cmd
	 */
	Response createUser(UserAddCmd cmd);

	/**
	 * 修改用户
	 *
	 * @param cmd
	 */
	Response modifyUser(UserModifyCmd cmd);

	/**
	 * 删除用户
	 *
	 * @param cmd
	 */
	Response removeUser(UserRemoveCmd cmd);

	/**
	 * 获取用户信息
	 *
	 * @param query
	 * @return
	 */
	SingleResponse<UserVO> getUserById(UserByIdQry query);

	/**
	 * 获取用户分页
	 *
	 * @param query
	 * @return
	 */
	PageResponse<UserVO> listUserByPage(UserListByPageQry query);
}