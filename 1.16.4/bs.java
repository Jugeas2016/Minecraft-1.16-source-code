/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Sets;
/*    */ import com.google.gson.JsonObject;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bs
/*    */   extends ck<bs.a>
/*    */ {
/* 18 */   private static final vk a = new vk("killed_by_crossbow");
/*    */ 
/*    */   
/*    */   public vk a() {
/* 22 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(JsonObject ☃, bg.b b1, ax ax1) {
/* 27 */     bg.b[] arrayOfB = bg.b.b(☃, "victims", ax1);
/* 28 */     bz.d d = bz.d.a(☃.get("unique_entity_types"));
/* 29 */     return new a(b1, arrayOfB, d);
/*    */   }
/*    */   
/*    */   public void a(aah ☃, Collection<aqa> collection) {
/* 33 */     List<cyv> list = Lists.newArrayList();
/* 34 */     Set<aqe<?>> set = Sets.newHashSet();
/* 35 */     for (aqa aqa : collection) {
/* 36 */       set.add(aqa.X());
/* 37 */       list.add(bg.b(☃, aqa));
/*    */     } 
/*    */     
/* 40 */     a(☃, a1 -> a1.a(☃, set.size()));
/*    */   }
/*    */   
/*    */   public static class a extends al {
/*    */     private final bg.b[] a;
/*    */     private final bz.d b;
/*    */     
/*    */     public a(bg.b ☃, bg.b[] arrayOfB, bz.d d1) {
/* 48 */       super(bs.b(), ☃);
/* 49 */       this.a = arrayOfB;
/* 50 */       this.b = d1;
/*    */     }
/*    */     
/*    */     public static a a(bg.a... ☃) {
/* 54 */       bg.b[] arrayOfB = new bg.b[☃.length];
/* 55 */       for (int i = 0; i < ☃.length; i++) {
/* 56 */         bg.a a1 = ☃[i];
/* 57 */         arrayOfB[i] = bg.b.a(a1.b());
/*    */       } 
/* 59 */       return new a(bg.b.a, arrayOfB, bz.d.e);
/*    */     }
/*    */     
/*    */     public static a a(bz.d ☃) {
/* 63 */       bg.b[] arrayOfB = new bg.b[0];
/* 64 */       return new a(bg.b.a, arrayOfB, ☃);
/*    */     }
/*    */     
/*    */     public boolean a(Collection<cyv> ☃, int i) {
/* 68 */       if (this.a.length > 0) {
/* 69 */         List<cyv> list = Lists.newArrayList(☃);
/* 70 */         for (bg.b b1 : this.a) {
/* 71 */           boolean bool = false;
/* 72 */           for (Iterator<cyv> iterator = list.iterator(); iterator.hasNext(); ) {
/* 73 */             cyv cyv = iterator.next();
/* 74 */             if (b1.a(cyv)) {
/* 75 */               iterator.remove();
/* 76 */               bool = true;
/*    */               
/*    */               break;
/*    */             } 
/*    */           } 
/* 81 */           if (!bool) {
/* 82 */             return false;
/*    */           }
/*    */         } 
/*    */       } 
/*    */       
/* 87 */       return this.b.d(i);
/*    */     }
/*    */ 
/*    */     
/*    */     public JsonObject a(ci ☃) {
/* 92 */       JsonObject jsonObject = super.a(☃);
/*    */       
/* 94 */       jsonObject.add("victims", bg.b.a(this.a, ☃));
/* 95 */       jsonObject.add("unique_entity_types", this.b.d());
/*    */       
/* 97 */       return jsonObject;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */