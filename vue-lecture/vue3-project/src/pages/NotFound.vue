<template>
  <div>
    <h2>404 not Found</h2>
    <hr />
    <p>
      현재 경로($route.fullPath) :
      <b class="highlight">{{ $route.fullPath }}</b>
    </p>
    <p>
      Not Found 컴포넌트의 이동 경로 :
      <b>path: "/:pathMatch(.*)*"</b>
    </p>
    <p>
      <b>없는 경로로 이동</b>하게 되면 <b>NotFound 컴포넌트</b>를 화면에
      표시한다.
    </p>
  </div>
</template>

<script setup></script>

<style scoped>
b {
  text-decoration: underline;
}
.highlight {
  color: red;
}
</style>
