<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/26
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal fade" id="xg" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">修改商品信息</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                    <div class="form-group ">
                        <label for="pid">商品编号</label>
                        <input type="text" class="form-control" readonly="readonly" id="pid"  placeholder="商品编号">
                    </div>
                    <div class="form-group">
                        <label for="pname">商品名称</label>
                        <input type="text" class="form-control" id="pname" placeholder="商品名称">
                    </div>
                    <div class="form-group ">
                        <label for="pprice">价格</label>
                        <input type="number" class="form-control" id="pprice" placeholder="价格">
                    </div>
                    <div class="form-group ">
                        <label for="pnumber">库存数量</label>
                        <input type="number" class="form-control" id="pnumber"  placeholder="库存数量">
                    </div>
                    <div class="form-group ">
                        <label for="ptime">发布时间</label>
                        <input type="date" class="form-control" id="ptime"  placeholder="发布时间">
                    </div>
                    <div class="form-group ">
                        <label for="pimg">图片路径</label>
                        <input type="text" class="form-control" id="pimg"  placeholder="图片路径">
                    </div>
                    <div class="form-group">
                        <label for="pstatus" class="col-xs-1 control-label">状态</label>
                        <div class="col-xs-10">
                            <label class="radio-inline">
                                <input type="radio"  id="pstatus" name="pstatus"value="上架中" checked>   上架
                            </label>
                            <label class="radio-inline">
                                <input type="radio" id="nopstatus"  name="pstatus" value="已下架">   下架
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="ptid">商品类型</label>
                        <select type="text" class="form-control" id="ptid" name="ptid" placeholder="press"></select>
                    </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" id="close" data-dismiss="modal">取消</button>
                    <button type="button"  class="btn btn-primary"onclick="upda()">确认修改</button>
                </div>
               </div>
        </div>
    </div>
</div>
</div>
