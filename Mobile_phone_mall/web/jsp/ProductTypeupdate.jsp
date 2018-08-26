<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/26
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="modal fade" id="xg" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">修改信息</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="form-group " id="tiddiv" hidden="hidden">
                    <label for="tid" class="col-xs-1 control-label">编号</label>
                    <div class="col-xs-10">
                        <input type="text" class="form-control" id="tid" name="tid" readonly="readonly"placeholder="编号">
                    </div>
                </div>
                <div class="form-group ">
                    <label for="tname" class="col-xs-1 control-label">用户名</label>
                    <div class="col-xs-10">
                        <input type="text" class="form-control" id="tname" name="tname" placeholder="用户名">
                    </div>
                </div>
                <div class="form-group ">
                    <label for="timg" class="col-xs-1 control-label">图片路径</label>
                    <div class="col-xs-10">
                        <input type="text" class="form-control" id="timg" name="timg" placeholder="用户名">
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">取消</button>
                <button type="button"  class="btn btn-primary"  id="oks"  onclick="upda()">确认修改</button>
            </div>
        </div>
    </div>
</div>
</div>
