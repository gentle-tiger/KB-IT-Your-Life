<template>
  <div>
    <h1>{{ siteInfo.siteName }}</h1>
    <a href="">{{ siteInfo.siteName }} 링크</a>
    <h2>방문 여부 : {{ siteInfo.visited }}</h2>
  </div>
</template>

<script>
export default {
  name: 'PropsList2',
  props: ['siteInfo'], // 한 번에 담아 보낼 수도 있고, 객체를 나열한 방식으로도 받을 수 있다.
  //  : {
  //     siteName: '페이스북',
  //     siteUrl: 'http://facebook.com',
  //     visited: '방문',
  //   },
  // },
};
</script>

<style lang="scss" scoped></style>
