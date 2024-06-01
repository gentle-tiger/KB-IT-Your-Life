<template>
  <div class="card card -body">
    <h2>Member Info</h2>
    <div>
      경로 패턴: /members/:id<br />
      요청 경로(path): {{ currentRoute.path }}<br />
      id 값(params.id): {{ currentRoute.params.id }}<br />
      fullPath: {{ currentRoute.fullPath }}<br />
      query: {{ currentRoute.query }}<br />
      name : {{ currentRoute.name }}<br />
      meta : {{ currentRoute.meta }}<br />
      hash : {{ currentRoute.hash }}<br />
    </div>
    <h4>경로뿐만 아니라 쿼리 문자열과 해시도 포함됩니다. ↓</h4>
    <div>예제 - > /members/123?sort=asc#section</div>
  </div>
</template>

<script setup>
import { useRoute } from 'vue-router';

const currentRoute = useRoute();
</script>
