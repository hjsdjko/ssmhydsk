import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import menpiaoyuding from '@/views/modules/menpiaoyuding/list'
    import discusslvyoushangpin from '@/views/modules/discusslvyoushangpin/list'
    import lvyoujingdian from '@/views/modules/lvyoujingdian/list'
    import xinwenzixun from '@/views/modules/xinwenzixun/list'
    import storeup from '@/views/modules/storeup/list'
    import lvyoushangpin from '@/views/modules/lvyoushangpin/list'
    import shangpindingdan from '@/views/modules/shangpindingdan/list'
    import discusslvyoujingdian from '@/views/modules/discusslvyoujingdian/list'
    import jingdianfenlei from '@/views/modules/jingdianfenlei/list'
    import yonghu from '@/views/modules/yonghu/list'
    import discussxinwenzixun from '@/views/modules/discussxinwenzixun/list'
    import xinwenleixing from '@/views/modules/xinwenleixing/list'
    import shangpinleixing from '@/views/modules/shangpinleixing/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/menpiaoyuding',
        name: '门票预订',
        component: menpiaoyuding
      }
          ,{
	path: '/discusslvyoushangpin',
        name: '旅游商品评论',
        component: discusslvyoushangpin
      }
          ,{
	path: '/lvyoujingdian',
        name: '旅游景点',
        component: lvyoujingdian
      }
          ,{
	path: '/xinwenzixun',
        name: '新闻资讯',
        component: xinwenzixun
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/lvyoushangpin',
        name: '旅游商品',
        component: lvyoushangpin
      }
          ,{
	path: '/shangpindingdan',
        name: '商品订单',
        component: shangpindingdan
      }
          ,{
	path: '/discusslvyoujingdian',
        name: '旅游景点评论',
        component: discusslvyoujingdian
      }
          ,{
	path: '/jingdianfenlei',
        name: '景点分类',
        component: jingdianfenlei
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/discussxinwenzixun',
        name: '新闻资讯评论',
        component: discussxinwenzixun
      }
          ,{
	path: '/xinwenleixing',
        name: '新闻类型',
        component: xinwenleixing
      }
          ,{
	path: '/shangpinleixing',
        name: '商品类型',
        component: shangpinleixing
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
