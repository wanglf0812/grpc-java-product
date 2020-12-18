package grpc.product.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import grpc.product.dao.ProductDao;
import grpc.product.dto.ProductDto;
import grpc.product.proto.ProductGrpc.ProductImplBase;
import grpc.product.proto.ReplyProduct;
import grpc.product.proto.ReplyProductList;
import grpc.product.proto.RequestLotNo;
import grpc.product.proto.RequestProduct;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class ProductServer extends ProductImplBase {
	@Autowired
	ProductDao productDao;

	@Override
	public void getProductByLotNo(RequestLotNo request, StreamObserver<ReplyProductList> responseObserver) {
		// TODO Auto-generated method stub

		List<ProductDto> productList = productDao.getProductByLotNo(request.getLotNoList());
		grpc.product.proto.ReplyProductList.Builder builderList = ReplyProductList.newBuilder();
		for (ProductDto product : productList) {
			grpc.product.proto.ReplyProduct.Builder builder = ReplyProduct.newBuilder();
			BeanUtils.copyProperties(product, builder);
			ReplyProduct replyProduct = builder.build();
			builderList.addReplyProductList(replyProduct);
		}
		ReplyProductList replyProductList = builderList.build();
		responseObserver.onNext(replyProductList);
		responseObserver.onCompleted();
	}

	@Override
	public void insertProduct(RequestProduct request, StreamObserver<ReplyProduct> responseObserver) {
		ProductDto productDto = new ProductDto();
		BeanUtils.copyProperties(request,productDto);
		int count = productDao.insertProdudt(productDto);
		System.out.println("商品登録件数："+String.valueOf(count)+" 商品ID："+String.valueOf(productDto.getId()));
		
		ProductDto product = productDao.getProductById(productDto.getId());
		grpc.product.proto.ReplyProduct.Builder builder = ReplyProduct.newBuilder();
		BeanUtils.copyProperties(product, builder);
		ReplyProduct replyProduct = builder.build();
		
		responseObserver.onNext(replyProduct);
		responseObserver.onCompleted();
	}

	@Override
	public void updateProduct(RequestProduct request, StreamObserver<ReplyProduct> responseObserver) {
		ProductDto productDto = new ProductDto();
		BeanUtils.copyProperties(request,productDto);
		int count = productDao.updateProdudt(productDto);
		System.out.println("商品更新件数："+String.valueOf(count)+" 商品ID："+String.valueOf(productDto.getId()));
		
		ProductDto product = productDao.getProductById(productDto.getId());
		grpc.product.proto.ReplyProduct.Builder builder = ReplyProduct.newBuilder();
		BeanUtils.copyProperties(product, builder);
		ReplyProduct replyProduct = builder.build();
		
		responseObserver.onNext(replyProduct);
		responseObserver.onCompleted();
	}
}
