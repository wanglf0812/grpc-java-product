// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package grpc.product.proto;

public final class ProductProto {
  private ProductProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_product_RequestLotNo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_product_RequestLotNo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_product_ReplyProductList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_product_ReplyProductList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_product_ReplyProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_product_ReplyProduct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_product_RequestProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_product_RequestProduct_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rproduct.proto\022\007product\"\036\n\014RequestLotNo" +
      "\022\016\n\006lot_no\030\001 \003(\003\"C\n\020ReplyProductList\022/\n\020" +
      "replyProductList\030\001 \003(\0132\025.product.ReplyPr" +
      "oduct\"\336\007\n\014ReplyProduct\022\n\n\002id\030\001 \001(\003\022\014\n\004cl" +
      "id\030\002 \001(\003\022\016\n\006lot_no\030\003 \001(\003\022\022\n\nproduct_cd\030\004" +
      " \001(\t\022\020\n\010ctgry_id\030\005 \001(\003\022\024\n\014product_name\030\006" +
      " \001(\t\022\026\n\016product_mgt_id\030\007 \001(\t\022\030\n\020mgt_prod" +
      "uct_name\030\010 \001(\t\022\036\n\026public_open_start_date" +
      "\030\t \001(\t\022\025\n\rproduct_model\030\n \001(\t\022\016\n\006jan_cd\030" +
      "\013 \001(\t\022\017\n\007isbn_cd\030\014 \001(\t\022\032\n\022product_spec_t" +
      "itle\030\r \001(\t\022\024\n\014sell_sts_kbn\030\016 \001(\t\022\022\n\nsell" +
      "_price\030\017 \001(\003\022\027\n\017sell_method_kbn\030\020 \001(\t\022\036\n" +
      "\026sell_instock_expct_day\030\021 \001(\t\022\031\n\021reserve" +
      "_regst_day\030\022 \001(\t\022\017\n\007tax_kbn\030\023 \001(\t\022\030\n\020com" +
      "parison_price\030\024 \001(\003\022\030\n\020double_price_txt\030" +
      "\025 \001(\t\022\031\n\021dlvfee_config_kbn\030\026 \001(\t\022\016\n\006dlvf" +
      "ee\030\027 \001(\003\022\034\n\024buy_limit_config_kbn\030\030 \001(\t\022\030" +
      "\n\020max_buy_quantity\030\031 \001(\005\022\030\n\020pt_magnifica" +
      "tion\030\032 \001(\005\022\030\n\020pwd_limit_config\030\033 \001(\t\022\034\n\024" +
      "pwd_limit_page_title\030\034 \001(\t\022\032\n\022pwd_limit_" +
      "page_msg\030\035 \001(\t\022\032\n\022time_sale_lock_flg\030\036 \001" +
      "(\005\022#\n\033time_sale_unlock_expct_date\030\037 \001(\t\022" +
      "\023\n\013favorite_su\030  \001(\003\022\026\n\016arrival_req_su\030!" +
      " \001(\003\022 \n\030exhibit_regst_method_kbn\030\" \001(\t\022\017" +
      "\n\007del_flg\030# \001(\005\022\023\n\013create_date\030$ \001(\t\022\023\n\013" +
      "update_date\030% \001(\t\022\021\n\tcreate_id\030& \001(\003\022\021\n\t" +
      "update_id\030\' \001(\003\022\025\n\rcreate_pgm_id\030( \001(\t\022\025" +
      "\n\rupdate_pgm_id\030) \001(\t\022\017\n\007version\030* \001(\003\"\224" +
      "\007\n\016RequestProduct\022\n\n\002id\030\001 \001(\003\022\014\n\004clid\030\002 " +
      "\001(\003\022\016\n\006lot_no\030\003 \001(\003\022\022\n\nproduct_cd\030\004 \001(\t\022" +
      "\020\n\010ctgry_id\030\005 \001(\003\022\024\n\014product_name\030\006 \001(\t\022" +
      "\026\n\016product_mgt_id\030\007 \001(\t\022\030\n\020mgt_product_n" +
      "ame\030\010 \001(\t\022\036\n\026public_open_start_date\030\t \001(" +
      "\t\022\025\n\rproduct_model\030\n \001(\t\022\016\n\006jan_cd\030\013 \001(\t" +
      "\022\017\n\007isbn_cd\030\014 \001(\t\022\032\n\022product_spec_title\030" +
      "\r \001(\t\022\024\n\014sell_sts_kbn\030\016 \001(\t\022\022\n\nsell_pric" +
      "e\030\017 \001(\003\022\027\n\017sell_method_kbn\030\020 \001(\t\022\036\n\026sell" +
      "_instock_expct_day\030\021 \001(\t\022\031\n\021reserve_regs" +
      "t_day\030\022 \001(\t\022\017\n\007tax_kbn\030\023 \001(\t\022\030\n\020comparis" +
      "on_price\030\024 \001(\003\022\030\n\020double_price_txt\030\025 \001(\t" +
      "\022\031\n\021dlvfee_config_kbn\030\026 \001(\t\022\016\n\006dlvfee\030\027 " +
      "\001(\003\022\034\n\024buy_limit_config_kbn\030\030 \001(\t\022\030\n\020max" +
      "_buy_quantity\030\031 \001(\005\022\030\n\020pt_magnification\030" +
      "\032 \001(\005\022\030\n\020pwd_limit_config\030\033 \001(\t\022\034\n\024pwd_l" +
      "imit_page_title\030\034 \001(\t\022\032\n\022pwd_limit_page_" +
      "msg\030\035 \001(\t\022\032\n\022time_sale_lock_flg\030\036 \001(\005\022#\n" +
      "\033time_sale_unlock_expct_date\030\037 \001(\t\022\023\n\013fa" +
      "vorite_su\030  \001(\003\022\026\n\016arrival_req_su\030! \001(\003\022" +
      " \n\030exhibit_regst_method_kbn\030\" \001(\t\022\021\n\tcre" +
      "ate_id\030& \001(\003\022\021\n\tupdate_id\030\' \001(\003\022\025\n\rcreat" +
      "e_pgm_id\030( \001(\t\022\025\n\rupdate_pgm_id\030) \001(\t2\330\001" +
      "\n\007Product\022G\n\021GetProductByLotNo\022\025.product" +
      ".RequestLotNo\032\031.product.ReplyProductList" +
      "\"\000\022A\n\rInsertProduct\022\027.product.RequestPro" +
      "duct\032\025.product.ReplyProduct\"\000\022A\n\rUpdateP" +
      "roduct\022\027.product.RequestProduct\032\025.produc" +
      "t.ReplyProduct\"\000B$\n\022grpc.product.protoB\014" +
      "ProductProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_product_RequestLotNo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_product_RequestLotNo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_product_RequestLotNo_descriptor,
        new java.lang.String[] { "LotNo", });
    internal_static_product_ReplyProductList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_product_ReplyProductList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_product_ReplyProductList_descriptor,
        new java.lang.String[] { "ReplyProductList", });
    internal_static_product_ReplyProduct_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_product_ReplyProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_product_ReplyProduct_descriptor,
        new java.lang.String[] { "Id", "Clid", "LotNo", "ProductCd", "CtgryId", "ProductName", "ProductMgtId", "MgtProductName", "PublicOpenStartDate", "ProductModel", "JanCd", "IsbnCd", "ProductSpecTitle", "SellStsKbn", "SellPrice", "SellMethodKbn", "SellInstockExpctDay", "ReserveRegstDay", "TaxKbn", "ComparisonPrice", "DoublePriceTxt", "DlvfeeConfigKbn", "Dlvfee", "BuyLimitConfigKbn", "MaxBuyQuantity", "PtMagnification", "PwdLimitConfig", "PwdLimitPageTitle", "PwdLimitPageMsg", "TimeSaleLockFlg", "TimeSaleUnlockExpctDate", "FavoriteSu", "ArrivalReqSu", "ExhibitRegstMethodKbn", "DelFlg", "CreateDate", "UpdateDate", "CreateId", "UpdateId", "CreatePgmId", "UpdatePgmId", "Version", });
    internal_static_product_RequestProduct_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_product_RequestProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_product_RequestProduct_descriptor,
        new java.lang.String[] { "Id", "Clid", "LotNo", "ProductCd", "CtgryId", "ProductName", "ProductMgtId", "MgtProductName", "PublicOpenStartDate", "ProductModel", "JanCd", "IsbnCd", "ProductSpecTitle", "SellStsKbn", "SellPrice", "SellMethodKbn", "SellInstockExpctDay", "ReserveRegstDay", "TaxKbn", "ComparisonPrice", "DoublePriceTxt", "DlvfeeConfigKbn", "Dlvfee", "BuyLimitConfigKbn", "MaxBuyQuantity", "PtMagnification", "PwdLimitConfig", "PwdLimitPageTitle", "PwdLimitPageMsg", "TimeSaleLockFlg", "TimeSaleUnlockExpctDate", "FavoriteSu", "ArrivalReqSu", "ExhibitRegstMethodKbn", "CreateId", "UpdateId", "CreatePgmId", "UpdatePgmId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
