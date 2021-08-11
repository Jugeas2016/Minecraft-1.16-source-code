/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import java.util.function.Predicate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ck<T extends al>
/*    */   implements af<T>
/*    */ {
/* 18 */   private final Map<vt, Set<af.a<T>>> a = Maps.newIdentityHashMap();
/*    */ 
/*    */   
/*    */   public final void a(vt ☃, af.a<T> a1) {
/* 22 */     ((Set<af.a<T>>)this.a.computeIfAbsent(☃, ☃ -> Sets.newHashSet())).add(a1);
/*    */   }
/*    */ 
/*    */   
/*    */   public final void b(vt ☃, af.a<T> a1) {
/* 27 */     Set<af.a<T>> set = this.a.get(☃);
/* 28 */     if (set != null) {
/* 29 */       set.remove(a1);
/* 30 */       if (set.isEmpty()) {
/* 31 */         this.a.remove(☃);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public final void a(vt ☃) {
/* 38 */     this.a.remove(☃);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final T b(JsonObject ☃, ax ax1) {
/* 45 */     bg.b b = bg.b.a(☃, "player", ax1);
/* 46 */     return b(☃, b, ax1);
/*    */   }
/*    */   
/*    */   protected void a(aah ☃, Predicate<T> predicate) {
/* 50 */     vt vt = ☃.J();
/* 51 */     Set<af.a<T>> set = this.a.get(vt);
/*    */     
/* 53 */     if (set == null || set.isEmpty()) {
/*    */       return;
/*    */     }
/*    */     
/* 57 */     cyv cyv = bg.b(☃, ☃);
/*    */     
/* 59 */     List<af.a<T>> list = null;
/* 60 */     for (af.a<T> a : set) {
/* 61 */       al al = (al)a.a();
/* 62 */       if (al.b().a(cyv) && predicate.test((T)al)) {
/* 63 */         if (list == null) {
/* 64 */           list = Lists.newArrayList();
/*    */         }
/* 66 */         list.add(a);
/*    */       } 
/*    */     } 
/*    */     
/* 70 */     if (list != null)
/* 71 */       for (af.a<T> a : list)
/* 72 */         a.a(vt);  
/*    */   }
/*    */   
/*    */   protected abstract T b(JsonObject paramJsonObject, bg.b paramb, ax paramax);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */