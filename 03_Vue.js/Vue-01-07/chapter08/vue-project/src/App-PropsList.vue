<template>
  <div>
    <PropsList siteName="네이버" siteUrl="http://naver.com" visited="방문" />
    <PropsList siteName="다음" siteUrl="http://daum.net" visited="미방문" />
    <PropsList2 :siteInfo="siteData" />
  </div>
</template>

<script>
import PropsList from './components/PropsList.vue';
import PropsList2 from './components/PropsList2.vue';

export default {
  name: 'App',
  components: {
    PropsList,
    PropsList2,
  },
  data() {
    return {
      siteData: {
        siteName: '페이스북',
        siteUrl: 'http://facebook.com',
        visited: '방문',
      },
    };
  },
};
</script>

<style lang="scss" scoped></style>
