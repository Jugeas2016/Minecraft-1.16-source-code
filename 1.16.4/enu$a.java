/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
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
/* 120 */   private final Map<vk, env> a = Maps.newHashMap();
/*     */   
/*     */   private void a(vk ☃, emr emr1, ach ach1) {
/* 123 */     env env = this.a.get(☃);
/* 124 */     boolean bool = (env == null);
/* 125 */     if (bool || emr1.b()) {
/* 126 */       if (!bool) {
/* 127 */         enu.h().debug("Replaced sound event location {}", ☃);
/*     */       }
/* 129 */       env = new env(☃, emr1.c());
/* 130 */       this.a.put(☃, env);
/*     */     } 
/*     */     
/* 133 */     for (emq emq : emr1.a()) {
/* 134 */       enw<emq> enw; vk vk1 = emq.a();
/*     */ 
/*     */       
/* 137 */       switch (enu.null.a[emq.g().ordinal()]) {
/*     */         case 1:
/* 139 */           if (!enu.a(emq, ☃, ach1)) {
/*     */             continue;
/*     */           }
/*     */           
/* 143 */           enw = emq;
/*     */           break;
/*     */         case 2:
/* 146 */           enw = new enw<emq>(this, vk1, emq)
/*     */             {
/*     */               public int e() {
/* 149 */                 env ☃ = (env)enu.a.a(this.c).get(this.a);
/* 150 */                 return (☃ == null) ? 0 : ☃.e();
/*     */               }
/*     */ 
/*     */               
/*     */               public emq a() {
/* 155 */                 env ☃ = (env)enu.a.a(this.c).get(this.a);
/* 156 */                 if (☃ == null) {
/* 157 */                   return enu.a;
/*     */                 }
/*     */ 
/*     */                 
/* 161 */                 emq emq1 = ☃.a();
/* 162 */                 return new emq(emq1
/* 163 */                     .a().toString(), emq1
/* 164 */                     .c() * this.b.c(), emq1
/* 165 */                     .d() * this.b.d(), this.b
/* 166 */                     .e(), emq.a.a, (emq1
/*     */                     
/* 168 */                     .h() || this.b.h()), emq1
/* 169 */                     .i(), emq1
/* 170 */                     .j());
/*     */               }
/*     */ 
/*     */ 
/*     */               
/*     */               public void a(enr ☃) {
/* 176 */                 env env = (env)enu.a.a(this.c).get(this.a);
/* 177 */                 if (env == null) {
/*     */                   return;
/*     */                 }
/* 180 */                 env.a(☃);
/*     */               }
/*     */             };
/*     */           break;
/*     */         default:
/* 185 */           throw new IllegalStateException("Unknown SoundEventRegistration type: " + emq.g());
/*     */       } 
/*     */       
/* 188 */       env.a(enw);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(Map<vk, env> ☃, enr enr1) {
/* 193 */     ☃.clear();
/*     */     
/* 195 */     for (Map.Entry<vk, env> entry : this.a.entrySet()) {
/* 196 */       ☃.put(entry.getKey(), entry.getValue());
/* 197 */       ((env)entry.getValue()).a(enr1);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */