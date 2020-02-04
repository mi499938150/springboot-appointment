<template>
  <div class="all-style">
    <!--跑马灯标题-->
    <div class="header-title">
      <!--图标-->
      <span class="header-title-left">
        <span class=" iconfont icon-laba1"></span>
      </span>
      <!--文字-->
      <span class="header-title-right">
             本店优惠活动XXXXXXX，截止日期XXXXX   
      </span>
    </div>
    <!-- 轮播图 -->
    <div class="header-swiper">
      <swiper :list="demo01_list" :aspect-ratio="350/700" >

      </swiper>

    </div>
  </div>
</template>

<script>
import { Swiper } from 'vux'

const baseList = [{
  url: 'javascript:',
  img: 'https://ww1.sinaimg.cn/large/663d3650gy1fq66vvsr72j20p00gogo2.jpg',
  title: '送你一朵fua'
}, {
  url: 'javascript:',
  img: 'https://ww1.sinaimg.cn/large/663d3650gy1fq66vw1k2wj20p00goq7n.jpg',
  title: '送你一辆车'
}, {
  url: 'javascript:',
  img: 'https://static.vux.li/demo/5.jpg', // 404
  title: '送你一次旅行',
  fallbackImg: 'https://ww1.sinaimg.cn/large/663d3650gy1fq66vw50iwj20ff0aaaci.jpg'
}]

export default {
   components:{
     Swiper
   },
   data(){
     return{
       demo01_list: baseList
     }
      
   }
}
</script>

<style>
 
 *{
     margin: 0 auto ;
 }

.all-style{
    width: 96%;
    height: auto;
    position: relative;

   
      /* background-color: yellow; */
}

.header-title{
  width: 100%;
  height: 30px;
  line-height: 30px;
  /* background-color: gray; */
}
.icon-icon--{
  font-size: 10px;
}

.header-title-left{
  float: left;
}

.header-title-right{
   margin-left: 10px;
   font-size: 15px;
   float: left;
}

.header-swiper{
  margin-top: 10px;
  width: 98%;
  height: 150px;
  /* border: 3px solid #3B3B3B;
  border-radius:10px; */
}

.icon-header{
  color: #5CACEE	;
  font-size: 20px;
}



</style>