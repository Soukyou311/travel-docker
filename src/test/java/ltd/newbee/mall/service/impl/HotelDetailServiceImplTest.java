package ltd.newbee.mall.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import ltd.newbee.mall.dao.GoodsReviewDetailMapper;
import ltd.newbee.mall.dao.HotelDetailMapper;
import ltd.newbee.mall.entity.GoodsReviewDetail;
import ltd.newbee.mall.entity.HotelDetail;

class HotelDetailServiceImplTest {

	@InjectMocks
	private HotelDetailServiceImpl hotelDetailService;

	@Mock
	private HotelDetailMapper hotelDetailMapper;

	@BeforeEach
	void setUp() throws Exception {
		// 初始化Mockito注解
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testGetHotelDetail() {
		// 假设hotelId为1，构造一个HotelDetail对象作为模拟返回值
		int hotelId = 1;
		HotelDetail expectedHotelDetail = new HotelDetail();
		expectedHotelDetail.setHotelId(hotelId);
		when(hotelDetailMapper.getHotelDetail(hotelId)).thenReturn(expectedHotelDetail);

		// 调用被测试的方法
		HotelDetail actualHotelDetail = hotelDetailService.getHotelDetail(hotelId);

		// 断言结果是否符合预期
		assertNotNull(actualHotelDetail);
		assertEquals(expectedHotelDetail, actualHotelDetail);
	}

	@InjectMocks
    private GoodsReviewDetailServiceImpl goodsReviewDetailService;

    @Mock
    private GoodsReviewDetailMapper goodsReviewDetailMapper;

    @Test
    void testGetGoodsReviewsByGoodsId() {
        // 设置模拟对象的行为和预期结果
        int goodsId = 1;
        List<GoodsReviewDetail> expectedReviews = new ArrayList<>();
        expectedReviews.add(new GoodsReviewDetail());
        when(goodsReviewDetailMapper.getGoodsReviewsByGoodsId(goodsId)).thenReturn(expectedReviews);

        // 调用被测试的方法
        List<GoodsReviewDetail> actualReviews = goodsReviewDetailService.getGoodsReviewsByGoodsId(goodsId);

        // 断言结果是否符合预期
        assertNotNull(actualReviews);
        assertEquals(expectedReviews, actualReviews);
    }
}

