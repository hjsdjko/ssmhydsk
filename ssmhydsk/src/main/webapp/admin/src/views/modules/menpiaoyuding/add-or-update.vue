<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row>
                        <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'" label="预订编号" prop="yudingbianhao">
            <el-input v-model="ruleForm.yudingbianhao" 
                placeholder="预订编号" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.yudingbianhao" label="预订编号" prop="yudingbianhao">
              <el-input v-model="ruleForm.yudingbianhao" 
                placeholder="预订编号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="景点名称" prop="jingdianmingcheng">
          <el-input v-model="ruleForm.jingdianmingcheng" 
              placeholder="景点名称" clearable  :readonly="ro.jingdianmingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="景点名称" prop="jingdianmingcheng">
              <el-input v-model="ruleForm.jingdianmingcheng" 
                placeholder="景点名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="景点分类" prop="jingdianfenlei">
          <el-input v-model="ruleForm.jingdianfenlei" 
              placeholder="景点分类" clearable  :readonly="ro.jingdianfenlei"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="景点分类" prop="jingdianfenlei">
              <el-input v-model="ruleForm.jingdianfenlei" 
                placeholder="景点分类" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="24">  
        <el-form-item class="upload" v-if="type!='info' && !ro.jingdiantupian" label="景点图片" prop="jingdiantupian">
          <file-upload
          tip="点击上传景点图片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.jingdiantupian?ruleForm.jingdiantupian:''"
          @change="jingdiantupianUploadChange"
          ></file-upload>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.jingdiantupian" label="景点图片" prop="jingdiantupian">
            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.jingdiantupian.split(',')" :src="item" width="100" height="100">
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="门票价格" prop="menpiaojiage">
          <el-input v-model="ruleForm.menpiaojiage" 
              placeholder="门票价格" clearable  :readonly="ro.menpiaojiage"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="门票价格" prop="menpiaojiage">
              <el-input v-model="ruleForm.menpiaojiage" 
                placeholder="门票价格" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="预订数量" prop="yudingshuliang">
          <el-input v-model="ruleForm.yudingshuliang" 
              placeholder="预订数量" clearable  :readonly="ro.yudingshuliang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="预订数量" prop="yudingshuliang">
              <el-input v-model="ruleForm.yudingshuliang" 
                placeholder="预订数量" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="总价格" prop="zongjiage">
            <el-input v-model="zongjiage"
                placeholder="总价格" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.zongjiage" label="总价格" prop="zongjiage">
              <el-input v-model="ruleForm.zongjiage" 
                placeholder="总价格" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="预订时间" prop="yudingshijian">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.yudingshijian" 
                type="date"
                placeholder="预订时间">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.yudingshijian" label="预订时间" prop="yudingshijian">
              <el-input v-model="ruleForm.yudingshijian" 
                placeholder="预订时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="用户账号" prop="yonghuzhanghao">
          <el-input v-model="ruleForm.yonghuzhanghao" 
              placeholder="用户账号" clearable  :readonly="ro.yonghuzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="用户账号" prop="yonghuzhanghao">
              <el-input v-model="ruleForm.yonghuzhanghao" 
                placeholder="用户账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="用户姓名" prop="yonghuxingming">
          <el-input v-model="ruleForm.yonghuxingming" 
              placeholder="用户姓名" clearable  :readonly="ro.yonghuxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="用户姓名" prop="yonghuxingming">
              <el-input v-model="ruleForm.yonghuxingming" 
                placeholder="用户姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="用户手机" prop="yonghushouji">
          <el-input v-model="ruleForm.yonghushouji" 
              placeholder="用户手机" clearable  :readonly="ro.yonghushouji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="用户手机" prop="yonghushouji">
              <el-input v-model="ruleForm.yonghushouji" 
                placeholder="用户手机" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                    <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="备注" prop="beizhu">
          <el-input v-model="ruleForm.beizhu" 
              placeholder="备注" clearable  :readonly="ro.beizhu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="备注" prop="beizhu">
              <el-input v-model="ruleForm.beizhu" 
                placeholder="备注" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
                                                                                          </el-row>
                                                                                                                                                                                                                                                                                                                                                                                                                          <el-form-item class="btn">
                <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    
    
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"#DCDFE6","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"#fff","dateIconFontSize":"14px","btnSaveBgColor":"rgba(117, 113, 249, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"#ecf5ff","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(117, 113, 249, 1)","btnSaveBorderWidth":"1px"},
      id: '',
      type: '',
      ro:{
	yudingbianhao : false,
	jingdianmingcheng : false,
	jingdianfenlei : false,
	jingdiantupian : false,
	menpiaojiage : false,
	yudingshuliang : false,
	zongjiage : false,
	yudingshijian : false,
	yonghuzhanghao : false,
	yonghuxingming : false,
	yonghushouji : false,
	beizhu : false,
	ispay : false,
	userid : false,
      },
            ruleForm: {
                        yudingbianhao: this.getUUID(),
                        	        jingdianmingcheng: '',
	                        	        jingdianfenlei: '',
	                        	        jingdiantupian: '',
	                        	        menpiaojiage: '',
	                        	        yudingshuliang: '',
	                        	        zongjiage: '',
	                        	        yudingshijian: '',
	                        	        yonghuzhanghao: '',
	                        	        yonghuxingming: '',
	                        	        yonghushouji: '',
	                        	        beizhu: '',
	                        	                        	        userid: '',
	                      },
                                                                                                                                                                                                                rules: {
                  yudingbianhao: [
                                    	                                                              ],
                  jingdianmingcheng: [
                                    	                                                              ],
                  jingdianfenlei: [
                                    	                                                              ],
                  jingdiantupian: [
                                    	                                                              ],
                  menpiaojiage: [
                                    	                                                              ],
                  yudingshuliang: [
                            { required: true, message: '预订数量不能为空', trigger: 'blur' },
                                        { validator: validateIntNumber, trigger: 'blur' },
                        	                                                              ],
                  zongjiage: [
                                    	                                                              ],
                  yudingshijian: [
                                    	                                                              ],
                  yonghuzhanghao: [
                                    	                                                              ],
                  yonghuxingming: [
                                    	                                                              ],
                  yonghushouji: [
                                    	                                                              ],
                  beizhu: [
                                    	                                                              ],
                  ispay: [
                                    	                                                              ],
                  userid: [
                            { required: true, message: '用户id不能为空', trigger: 'blur' },
                                    	                                                              ],
              }
    };
  },
  props: ["parent"],
  computed: {
                                                                                    zongjiage:{
                                                                                                                                                                                                                                get: function () {
        return 1*this.ruleForm.menpiaojiage*this.ruleForm.yudingshuliang
      }
    },
                                                                                                  },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
        // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          	            if(o=='yudingbianhao'){
            this.ruleForm.yudingbianhao = obj[o];
	    this.ro.yudingbianhao = true;
            continue;
          }
	            	            if(o=='jingdianmingcheng'){
            this.ruleForm.jingdianmingcheng = obj[o];
	    this.ro.jingdianmingcheng = true;
            continue;
          }
	            	            if(o=='jingdianfenlei'){
            this.ruleForm.jingdianfenlei = obj[o];
	    this.ro.jingdianfenlei = true;
            continue;
          }
	            	            if(o=='jingdiantupian'){
            this.ruleForm.jingdiantupian = obj[o];
	    this.ro.jingdiantupian = true;
            continue;
          }
	            	            if(o=='menpiaojiage'){
            this.ruleForm.menpiaojiage = obj[o];
	    this.ro.menpiaojiage = true;
            continue;
          }
	            	            if(o=='yudingshuliang'){
            this.ruleForm.yudingshuliang = obj[o];
	    this.ro.yudingshuliang = true;
            continue;
          }
	            	            if(o=='zongjiage'){
            this.ruleForm.zongjiage = obj[o];
	    this.ro.zongjiage = true;
            continue;
          }
	            	            if(o=='yudingshijian'){
            this.ruleForm.yudingshijian = obj[o];
	    this.ro.yudingshijian = true;
            continue;
          }
	            	            if(o=='yonghuzhanghao'){
            this.ruleForm.yonghuzhanghao = obj[o];
	    this.ro.yonghuzhanghao = true;
            continue;
          }
	            	            if(o=='yonghuxingming'){
            this.ruleForm.yonghuxingming = obj[o];
	    this.ro.yonghuxingming = true;
            continue;
          }
	            	            if(o=='yonghushouji'){
            this.ruleForm.yonghushouji = obj[o];
	    this.ro.yonghushouji = true;
            continue;
          }
	            	            if(o=='beizhu'){
            this.ruleForm.beizhu = obj[o];
	    this.ro.beizhu = true;
            continue;
          }
	            	            	            if(o=='userid'){
            this.ruleForm.userid = obj[o];
	    this.ro.userid = true;
            continue;
          }
	                    }
                                                                                                                                                                                                                                              }
            // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
                                                                                                                                                                                                      		if(json.yonghuzhanghao!=''&&json.yonghuzhanghao){
              		this.ruleForm.yonghuzhanghao = json.yonghuzhanghao
		}
                                  		if(json.yonghuxingming!=''&&json.yonghuxingming){
              		this.ruleForm.yonghuxingming = json.yonghuxingming
		}
                                  		if(json.yonghushouji!=''&&json.yonghushouji){
              		this.ruleForm.yonghushouji = json.yonghushouji
		}
                                                                                                } else {
          this.$message.error(data.msg);
        }
      });
                                                                                                                                                                                                                                                                                          },
                                                                                                                        // 多级联动参数
                                                                                                                                                        info(id) {
      this.$http({
        url: `menpiaoyuding/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.ruleForm = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
        // 提交
    onSubmit() {
                  // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
              this.ruleForm.zongjiage = this.zongjiage
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                              // ${column.compare}
                                                                                                                                                                                                                                                                                                this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: `menpiaoyuding/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.menpiaoyudingCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.menpiaoyudingCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
                                                            jingdiantupianUploadChange(fileUrls) {
                this.ruleForm.jingdiantupian = fileUrls;
				this.addEditUploadStyleChange()
            },
                                                                                                                                    	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
}
.btn .el-button {
  padding: 0;
}
</style>
