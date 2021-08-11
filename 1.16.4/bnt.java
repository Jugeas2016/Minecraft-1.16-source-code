/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.List;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bnt
/*    */ {
/*    */   private final String a;
/*    */   private final ImmutableList<apu> b;
/*    */   
/*    */   public static bnt a(String ☃) {
/* 15 */     return gm.U.a(vk.a(☃));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public bnt(apu... ☃) {
/* 21 */     this(null, ☃);
/*    */   }
/*    */   
/*    */   public bnt(@Nullable String ☃, apu... arrayOfApu) {
/* 25 */     this.a = ☃;
/* 26 */     this.b = ImmutableList.copyOf((Object[])arrayOfApu);
/*    */   }
/*    */   
/*    */   public String b(String ☃) {
/* 30 */     return ☃ + ((this.a == null) ? gm.U.b(this).a() : this.a);
/*    */   }
/*    */   
/*    */   public List<apu> a() {
/* 34 */     return (List<apu>)this.b;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 38 */     if (!this.b.isEmpty()) {
/* 39 */       for (UnmodifiableIterator<apu> unmodifiableIterator = this.b.iterator(); unmodifiableIterator.hasNext(); ) { apu ☃ = unmodifiableIterator.next();
/* 40 */         if (☃.a().a()) {
/* 41 */           return true;
/*    */         } }
/*    */     
/*    */     }
/*    */     
/* 46 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bnt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */