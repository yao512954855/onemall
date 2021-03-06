package cn.iocoder.mall.user.api;

import cn.iocoder.common.framework.vo.CommonResult;
import cn.iocoder.mall.user.api.bo.UserAddressBO;
import cn.iocoder.mall.user.api.dto.UserAddressAddDTO;
import cn.iocoder.mall.user.api.dto.UserAddressUpdateDTO;

import java.util.List;

/**
 * 用户地址
 *
 * @author Sin
 * @time 2019-04-06 13:24
 */
public interface UserAddressService {

    // TODO FROM 芋艿 to 小范：泛型哈。另外，Service 不用 CommonResult 返回

    CommonResult addAddress(UserAddressAddDTO userAddressAddDTO);

    CommonResult updateAddress(UserAddressUpdateDTO userAddressAddDTO);

    CommonResult removeAddress(Integer userId, Integer addressId);

    CommonResult<List<UserAddressBO>> addressList(Integer userId);

    CommonResult<UserAddressBO> getAddress(Integer userId, Integer id);

    CommonResult<UserAddressBO> getDefaultAddress(Integer userId);
}
