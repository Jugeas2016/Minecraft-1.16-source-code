/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */ {
/*     */   private final Map<aqo, List<btg.c>> a;
/*     */   private final Map<aqe<?>, btg.b> b;
/*     */   private float c;
/*     */   private boolean d;
/*     */   
/*     */   public a() {
/* 122 */     this.a = (Map<aqo, List<btg.c>>)Stream.<aqo>of(aqo.values()).collect(ImmutableMap.toImmutableMap(☃ -> ☃, ☃ -> Lists.newArrayList()));
/* 123 */     this.b = Maps.newLinkedHashMap();
/* 124 */     this.c = 0.1F;
/*     */   }
/*     */   
/*     */   public a a(aqo ☃, btg.c c1) {
/* 128 */     ((List<btg.c>)this.a.get(☃)).add(c1);
/* 129 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a a(aqe<?> ☃, double d1, double d2) {
/* 155 */     this.b.put(☃, new btg.b(d2, d1, null));
/* 156 */     return this;
/*     */   }
/*     */   
/*     */   public a a(float ☃) {
/* 160 */     this.c = ☃;
/* 161 */     return this;
/*     */   }
/*     */   
/*     */   public a a() {
/* 165 */     this.d = true;
/* 166 */     return this;
/*     */   }
/*     */   
/*     */   public btg b() {
/* 170 */     return new btg(this.c, (Map)this.a
/*     */         
/* 172 */         .entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, ☃ -> ImmutableList.copyOf((Collection)☃.getValue()))), 
/* 173 */         (Map)ImmutableMap.copyOf(this.b), this.d, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btg$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */