package grpc.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import grpc.product.dto.ProductDto;

@Component
@Mapper
public interface ProductDao {
	
	public List<ProductDto> getProductByLotNo(List<Long> lotNoList);
	
	public ProductDto getProductById(Long id);
	
	public int insertProdudt(ProductDto productDto);
	
	public int updateProdudt(ProductDto productDto);

}
