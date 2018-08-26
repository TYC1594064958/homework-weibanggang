<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 邦杠
  Date: 2018/8/25
  Time: 23:24
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
                    <div class="form-group ">
                        <label for="aid" class="col-xs-1 control-label">编号</label>
                        <div class="col-xs-10">
                            <input type="text" class="form-control" id="aid" name="aid" readonly="readonly"placeholder="编号">
                        </div>
                    </div>
                    <div class="form-group ">
                        <label for="aname" class="col-xs-1 control-label">用户名</label>
                        <div class="col-xs-10">
                            <input type="text" class="form-control" id="aname" name="aname" placeholder="用户名">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="astatus" class="col-xs-1 control-label">状态</label>
                        <div class="col-xs-10">
                            <label class="radio-inline">
                                <input type="radio"  id="astatus" name="astatus"value="可用" checked>   可用
                            </label>
                            <label class="radio-inline">
                                <input type="radio" id="noastatus"  name="astatus" value="不可用">   不可用
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="atype" class="col-xs-1 control-label">管理类型</label>
                        <div class="col-xs-10">
                            <select class="form-control" id="atype"name="atype" >
                                <option value="高级管理">高级管理</option>
                                <option value="普通管理">普通管理</option>
                            </select>
                        </div>
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" id="close" data-dismiss="modal">取消</button>
                    <button type="button"  class="btn btn-primary"onclick="upda()">确认修改</button>
                </div>
            </div>
        </div>
    </div>
    </div>


